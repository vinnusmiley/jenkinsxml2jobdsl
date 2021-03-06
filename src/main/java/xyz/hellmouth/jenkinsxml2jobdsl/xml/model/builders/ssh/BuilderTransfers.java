package xyz.hellmouth.jenkinsxml2jobdsl.xml.model.builders.ssh;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;

import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Buildable;
import xyz.hellmouth.jenkinsxml2jobdsl.jobdsl.Builder;

public class BuilderTransfers implements Buildable{

	@XmlElements({
		@XmlElement(name="jenkins.plugins.publish__over__ssh.BapSshTransfer", type=SSHBuilderTransfer.class)
	    })
	public List<Buildable> elements;

	@Override
	public void build(Builder builder) {
		for (Buildable b : elements){
			b.build(builder);
		}
		
	}
}
