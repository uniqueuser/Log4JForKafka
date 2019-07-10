package log4jkafka;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by paras.mal on 8/7/19.
 */
public class LogString extends HttpServlet{

    private static final Logger LOG = LogManager.getLogger(LogString.class);
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        LOG.info(request.getRequestURL().toString());
        try {
            response.getWriter().write("done");
        }catch (Exception e){

        }

    }

}
