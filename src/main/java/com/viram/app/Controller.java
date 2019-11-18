package com.viram.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

	@GetMapping("/runc")
	public List<String> sayhelloworld() throws InterruptedException, IOException
	{
		ProcessBuilder pb = new ProcessBuilder();
		pb.command("CMD", "/C","docker run gccimage");
		Process p = pb.start();

		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		 String line;
		 List<String> output = new ArrayList<String>();
		          while ((line = br.readLine()) != null) {
		              output.add(line) ;
		          }
		 return output;
//	   final DockerClient docker = DefaultDockerClient.fromEnv().build();
//	  	// Pull an image
//	   
//
//	// Bind container ports to host ports
////	final String[] ports = {"80", "22"};
////	final Map<String, List<PortBinding>> portBindings = new HashMap<>();
////	for (String port : ports) {
////	    List<PortBinding> hostPorts = new ArrayList<>();
////	    hostPorts.add(PortBinding.of("192.168.99.100", port));
////	    portBindings.put(port, hostPorts);
////	}
////
////	// Bind container port 443 to an automatically allocated available host port.
////	List<PortBinding> randomPort = new ArrayList<>();
////	randomPort.add(PortBinding.randomPort("192.168.99.100"));
////	portBindings.put("2376", randomPort);
////
////	final HostConfig hostConfig = HostConfig.builder().portBindings(portBindings).build();
//
//	// Create container with exposed ports
//	final ContainerConfig containerConfig = ContainerConfig.builder()
//		.image("gccimage")
//	    .cmd("sh", "-c", "while :; do sleep 5; done")
//		.build();
////	    .cmd("sh", "-c", "while :; do sleep 1; done")
//	    
//
////    .hostConfig(hostConfig)
//	//	.image("gccimage")//.exposedPorts(ports)
//	final ContainerCreation creation = docker.createContainer(containerConfig);
//	final String id = creation.id();
//
//	// Inspect container
////	final ContainerInfo info = docker.inspectContainer(id);
//
//	// Start container
//	docker.startContainer(id);
//
//	// Exec command inside running container with attached STDOUT and STDERR
//	final String[] command = {};
//	final ExecCreation execCreation = docker.execCreate(
//	    id, command, DockerClient.ExecCreateParam.attachStdout(),
//	    DockerClient.ExecCreateParam.attachStderr());
//	final LogStream output = docker.execStart(execCreation.id());
//	final String execOutput = output.readFully();
//
//	// Kill container
//	docker.killContainer(id);
/////
////	// Remove container
//	docker.removeContainer(id);
////
//	/// Close the docker client
//	docker.close();
//	return execOutput;
//	}
	
}
		          
	}
