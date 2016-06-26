package groups;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
//import org.testng.IExecutionListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.ITestAnnotation;

public class Executelistner implements IAnnotationTransformer
{
   // @Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	{
		// TODO Auto-generated method stub
		
		if (testMethod.getName().equals("execute_01"))
		{
			System.out.println("working"+testMethod.getName());
			//annotation.setDataProviderClass(DataProvider.class);
			annotation.setDataProvider("dataproviding");
			annotation.getSuccessPercentage();
			System.out.println(annotation);
			
			
		}
	}

	
}
