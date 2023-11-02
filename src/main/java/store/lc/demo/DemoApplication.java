package store.lc.demo;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;

import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.*;
import org.apache.http.client.CredentialsProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.List;
import java.util.Properties;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);

		Regions clientRegion = Regions.US_EAST_2;
		String bucketName = "kls3";
		String sourceKey = "TestFile.txt";
		String destinationKey = "TestFile.txt";

		final AmazonS3 s3 = AmazonS3ClientBuilder.standard().withRegion(clientRegion).build();
//
//		try {
//			s3.putObject(bucketName, destinationKey, new File(sourceKey));
//		} catch (AmazonServiceException e) {
//			System.err.println(e.getErrorMessage());
//			System.exit(1);
//		}

        ListObjectsV2Result result = s3.listObjectsV2(bucketName);
        List<S3ObjectSummary> objects = result.getObjectSummaries();
        for (S3ObjectSummary os : objects) {
			File f = new File(os.getKey());
			if(f.exists()) {
				System.out.println("OKAY!");
			}else {
				try {
					System.out.println("I'M MISSING!");
					S3Object o = s3.getObject(bucketName, sourceKey);
					S3ObjectInputStream s3is = o.getObjectContent();
					FileOutputStream fos = new FileOutputStream(new File(sourceKey));
					byte[] read_buf = new byte[1024];
					int read_len = 0;
					while ((read_len = s3is.read(read_buf)) > 0) {
						fos.write(read_buf, 0, read_len);
					}
					s3is.close();
					fos.close();
				} catch (AmazonServiceException e) {
					System.err.println(e.getErrorMessage());
					System.exit(1);
				} catch (IOException e) {
					System.err.println(e.getMessage());
					System.exit(1);
				}
			}
        }


	}

}
