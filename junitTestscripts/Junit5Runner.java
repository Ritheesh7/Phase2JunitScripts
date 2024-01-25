package junitTestscripts;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


// Running multiple junit classes
//@RunWith(Suite.class)
@SuiteClasses({junitTestscripts.IncludeExcludeTags.class})
@IncludeTags({"feature1"})
public class Junit5Runner {
}
