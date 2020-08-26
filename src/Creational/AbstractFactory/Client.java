package Creational.AbstractFactory;

import Creational.AbstractFactory.aws.AwsResourceFactory;
import Creational.AbstractFactory.gcp.GoogleResourceFactory;

public class Client {

    public static void main(String[] args) {

        ResourceFactory awsResourceFactory = new AwsResourceFactory();
        Instance awsInstance = awsResourceFactory.createInstance(Instance.Capacity.large);
        Storage awsStorage = awsResourceFactory.createStorage(64);
        System.out.println(awsInstance.toString());

        ResourceFactory googleResourceFactory = new GoogleResourceFactory();
        Instance googleInstance = googleResourceFactory.createInstance(Instance.Capacity.small);
        Storage googleStorage = googleResourceFactory.createStorage(16);
        System.out.println(googleInstance.toString());

    }
}
