package interceptors;


import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

@Loggable
@Interceptor
public class LoggingInterceptor {

    @Inject
    Logger logger;

    @AroundInvoke
    private Object doLog(InvocationContext ic) throws Exception {
        logger.warning(ic.getTarget().getClass().getName()+":" +ic.getMethod().getName() + "ENTERINGG");

        try {
            return ic.proceed();
        } finally {
            logger.warning(ic.getTarget().toString()+ ic.getMethod().getName() + "EXITINGG");
        }


    }

}
