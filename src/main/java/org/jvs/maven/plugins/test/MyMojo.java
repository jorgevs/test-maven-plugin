package org.jvs.maven.plugins.test;

import org.apache.maven.artifact.DependencyResolutionRequiredException;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Mojo(name = "myGoal", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class MyMojo extends AbstractMojo {

	@Parameter(defaultValue = "${project}")
	private MavenProject project;

	@Parameter(defaultValue = "Hello")
	private String myString;
	@Parameter
	private Boolean myBoolean;
	@Parameter
	private Integer myInteger;
	@Parameter
	private Double myDouble;
	@Parameter
	private File myFile;
	@Parameter
	private String myURL;
	@Parameter
	private int timeout;
	@Parameter
	private String[] options;
	@Parameter
	private List animals;
	@Parameter
	private Map myMap;
	@Parameter
	private Properties myProperties;

	public void execute() throws MojoExecutionException {
		getLog().info("project.toString(): " + project.toString());
		getLog().info("project.getDefaultGoal(): " + project.getDefaultGoal());
		getLog().info("project.getPackaging(): " + project.getPackaging());
		getLog().info("project.getActiveProfiles(): " + project.getActiveProfiles());
		getLog().info("project.getAttachedArtifacts(): " + project.getAttachedArtifacts());
		getLog().info("project.getBasedir(): " + project.getBasedir());
		getLog().info("project.getBuildPlugins(): " + project.getBuildPlugins());
		getLog().info("project.getDependencies(): " + project.getDependencies());
		getLog().info("project.getDistributionManagement(): " + project.getDistributionManagement());
		getLog().info("project.getExecutionProject(): " + project.getExecutionProject());
		getLog().info("project.getFile(): " + project.getFile());
		getLog().info("project.getParent(): " + project.getParent());
		getLog().info("project.getSystemDependencies(): " + project.getSystemDependencies());
		getLog().info("project.getCompileSourceRoots(): " + project.getCompileSourceRoots());

		getLog().info("project.getBuild().getDefaultGoal(): " + project.getBuild().getDefaultGoal());
		getLog().info("project.getBuild().getDirectory(): " + project.getBuild().getDirectory());
		getLog().info("project.getBuild()getFinalName(): " + project.getBuild().getFinalName());
		getLog().info("project.getBuild().getOutputDirectory(): " + project.getBuild().getOutputDirectory());
		getLog().info("project.getBuild().getScriptSourceDirectory(): " + project.getBuild().getScriptSourceDirectory());
		getLog().info("project.getBuild().getSourceDirectory(): " + project.getBuild().getSourceDirectory());
		getLog().info("project.getBuild().getTestSourceDirectory(): " + project.getBuild().getTestSourceDirectory());
		getLog().info("project.getBuild().getExtensions()) " + project.getBuild().getExtensions());
		getLog().info("project.getBuild().getFilters(): " + project.getBuild().getFilters());
		getLog().info("project.getBuild().getPluginManagement(): " + project.getBuild().getPluginManagement());
		getLog().info("project.getBuild().getPlugins(): " + project.getBuild().getPlugins());
		getLog().info("project.getBuild().getResources(): " + project.getBuild().getResources());
		getLog().info("project.getBuild().getTestResources(): " + project.getBuild().getTestResources());

		try {
			getLog().info("project.getSystemClasspathElements(): " + project.getSystemClasspathElements());
		} catch (DependencyResolutionRequiredException e) {
			getLog().error("Exception while getting the SystemClasspathElements.", e);
		}

		getLog().info("-----------PARAMETERS-----------");
		getLog().info("myString: " + myString);
		getLog().info("myBoolean: " + myBoolean);
		getLog().info("myInteger: " + myInteger);
		getLog().info("myFile: " + myFile);
		getLog().info("myURL: " + myURL);
		getLog().info("options: " + options);
		getLog().info("animals: " + animals);
		getLog().info("myMap: " + myMap);
		getLog().info("myProperties: " + myProperties);

		/*
		 * File f = outputDirectory;
		 * 
		 * if (!f.exists()) { f.mkdirs(); }
		 * 
		 * File touch = new File(f, "touch.txt");
		 * 
		 * FileWriter w = null; try { w = new FileWriter(touch);
		 * w.write("touch.txt"); } catch (IOException e) { throw new
		 * MojoExecutionException("Error creating file " + touch, e); } finally
		 * { if (w != null) { try { w.close(); } catch (IOException e) { //
		 * ignore } } }
		 */
	}
}
