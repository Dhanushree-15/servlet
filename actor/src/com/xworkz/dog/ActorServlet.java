package com.xworkz.dog;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/actor", loadOnStartup = 1)
public class ActorServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {

        // Corrected variable names
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();

        String name = servletRequest.getParameter("name");
        String language = servletRequest.getParameter("language");
        String salary = servletRequest.getParameter("salary");
        String blockbusters = servletRequest.getParameter("blockbusters");
        String flops = servletRequest.getParameter("flops");
        String upcomingMovie = servletRequest.getParameter("upcomingMovie");
        String producer = servletRequest.getParameter("producer");
        String director = servletRequest.getParameter("director");
        String budget = servletRequest.getParameter("budget");

        out.println("<html><body>");
        out.println("<h2>Actor Data Received Successfully</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Language: " + language + "</p>");
        out.println("<p>Salary: " + salary + "</p>");
        out.println("<p>Blockbusters: " + blockbusters + "</p>");
        out.println("<p>Flops: " + flops + "</p>");
        out.println("<p>Upcoming Movie: " + upcomingMovie + "</p>");
        out.println("<p>Producer: " + producer + "</p>");
        out.println("<p>Director: " + director + "</p>");
        out.println("<p>Budget: " + budget + "</p>");
        out.println("<p style='color:green;'>✅ Actor data submitted successfully!</p>");
        out.println("</body></html>");
    }
}
