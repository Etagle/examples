package com.rgfp.scrumdeveloper.refactoring;

import com.rgfp.scrumdeveloper.messageHandling.v1.MessageHandlingV1;
import com.rgfp.scrumdeveloper.messageHandling.v2.MessageHandlingV2;
import com.rgfp.scrumdeveloper.messageHandling.v3.MessageHandlingV3;
import com.rgfp.scrumdeveloper.messageHandling.v4.MessageHandlingV4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RefactoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RefactoringApplication.class, args);

        MessageHandlingV1 messageHandlingV1 = new MessageHandlingV1();
        MessageHandlingV2 messageHandlingV2 = new MessageHandlingV2();
        MessageHandlingV3 messageHandlingV3 = new MessageHandlingV3();
        MessageHandlingV4 messageHandlingV4 = new MessageHandlingV4();

        System.out.println("Printing ");

        System.out.print("V1 message: ");
        messageHandlingV1.printStatus();

        System.out.print("V2 message: ");
        messageHandlingV2.printStatus();

        System.out.print("V3 message: ");
        messageHandlingV3.printStatus();

        System.out.print("V4 message: ");
        messageHandlingV4.printStatus();


        System.out.println("Sending email ");

        System.out.print("V1 message: ");
        messageHandlingV1.sendEmailWithStatus();

        System.out.print("V2 message: ");
        messageHandlingV2.sendEmailWithStatus();

        System.out.print("V3 message: ");
        messageHandlingV3.sendEmailWithStatus();

        System.out.print("V4 message: ");
        messageHandlingV4.sendEmailWithStatus();
	}
}
