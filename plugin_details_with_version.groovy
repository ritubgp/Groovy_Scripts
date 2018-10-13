import jenkins.model.*
import hudson.model.*

def plugins = jenkins.model.Jenkins.instance.getPluginManager().getPlugins()
plugins.each {println "${it.getDisplayName()}: ${it.getShortName()}: ${it.getVersion()}"}
