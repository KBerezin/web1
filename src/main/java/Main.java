import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.MainServlet;
import servlets.MultiplyServlet;


public class Main {
    public static void main(String[] args) throws Exception {
        MainServlet mainServlet = new MainServlet();
        MultiplyServlet multiplyServlet = new MultiplyServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(mainServlet), "/");
        context.addServlet(new ServletHolder(multiplyServlet), "/mult");

        Server server = new Server(8079);
        server.setHandler(context);

        server.start();
        server.join();
    }

}
