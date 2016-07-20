package descriptors;

import javax.management.DescriptorKey;
import java.lang.annotation.*;

/**
 * Created by yangjinqiu on 7/20/16.
 */

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DisplayName {

	@DescriptorKey("displayName")
	String value();

}
