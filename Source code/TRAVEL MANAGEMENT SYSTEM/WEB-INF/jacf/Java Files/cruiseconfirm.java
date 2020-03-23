import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class cruiseconfirm extends HttpServlet {

    public void init(ServletConfig config)
    	throws ServletException {
    		super.init(config);
    	}
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("Your request was"+ request.getMethod()+"\n");
        out.println("</body>");
        out.println("</html>");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        Connection c=null;
        
        String loginid=request.getParameter("loginid");
        String source=request.getParameter("source");
        String destination=request.getParameter("destination");
        String sdd=request.getParameter("sdd");
        String smm=request.getParameter("smm");
        String syy=request.getParameter("syy");
        String cruiselines = request.getParameter("cruiselines");
        String nights=request.getParameter("nights");
        String tickets=request.getParameter("tickets");
        String children=request.getParameter("children");
        String cardno=request.getParameter("cardno");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String query =null;
   		try{
   			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c= DriverManager.getConnection("jdbc:odbc:ITMNGMNT","grandtour","grandtour");
            Statement st =c.createStatement();
            int reqno=0;
        //    query = new String("select * from flightbooking"); 
            ResultSet rs= st.executeQuery("select * from cruisebooking");
                               
            if(rs.next())
            {
            			
            		//	query = new String("select max(reqno) as rno from cruisebooking"); 
            			ResultSet rs2= st.executeQuery("select max(reqno) as rno from cruisebooking");
            			if(rs2.next())
            			reqno= rs2.getInt(1) + 1;
            			
            }
            else
            
            
            	reqno =400;
            
            query = new String("insert into cruisebooking values('"+loginid+"','"+source+"','"+destination+"','"+sdd+"','"+smm+"','"+syy+"','"+cruiselines+"','"+nights+"','"+tickets+"','"+children+"','"+cardno+"',"+reqno+")");
            	
				
			st.executeUpdate(query);
			
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Untitled Document</title>");
			out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">");
			out.println("<style type=\"text/css\">");
			out.println("<!--");
			out.println(".style11 {color: #FFFFFF}");
			out.println(".style12 {");
			out.println("color: #000000;");
			out.println("font-weight: bold;");
			out.println("}");
			out.println("-->");
			out.println("</style>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div align=\"center\">");
			out.println("<center>");
			out.println("<div align=\"center\">");
			out.println("<center>");
			out.println("<TABLE cellSpacing=0 cellPadding=0 width=750 border=0 style=\"border-collapse: collapse\" bordercolor=\"#111111\">");
			out.println("<TBODY>");
			out.println("<TR> ");
			out.println("<TD class=header>              <img src=\"http://localhost:2008/hcutravels/images/frontpage.gif\" width=\"386\" height=\"71\"><img src=\"http://localhost:2008/hcutravels/images/Hdr_AS_Seal.jpg\" width=\"289\" height=\"71\"><img src=\"http://localhost:2008/hcutravels/images/1animated12-thumb[1].gif\" width=\"67\" height=\"50\"></TD>");
			out.println("</TR>");
			out.println("</TBODY>");
			out.println("</TABLE>");
			out.println("</center>");
			out.println("</div>");
			out.println("<p align=\"left\"><font face=\"arial\" size=\"2\"> ");
			out.println("<marquee behavior=\"scroll\" style=\"font-family: Courier New; color: #333300; text-decoration: blink; font-size: 18pt; font-style: italic; font-weight: bold\">");
			out.println("we share a visi<img src=\"http://localhost:2008/hcutravels/images/Animsun.gif\" width=\"60\" height=\"48\">n ");
			out.println("</marquee>");
			out.println("</font></p>");
			out.println("</center>");
			out.println("</div>");
			out.println("<table width=\"97%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
			out.println("<tr bordercolor=\"#CCCCCC\" bgcolor=\"#000099\"> ");
            out.println("<td width=\"10%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/home.htm\"><font color=\"#FFFFFF\" size=\"5\">Home</font></a></div></td>");
            out.println("<td width=\"14%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/services.htm\"><font color=\"#FFFFFF\" size=\"5\">Services</font></a></div></td>");
            out.println("<td width=\"25%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/packagefinal.htm\"><font color=\"#FFFFFF\" size=\"5\">Holiday ");
			out.println("Packages </font></a></div></td>");
            out.println("<td width=\"11%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/faq.htm\"><font color=\"#FFFFFF\" size=\"5\">FAQs</font></a></div></td>");
            out.println("<td width=\"25%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/register.htm\"><font color=\"#FFFFFF\" size=\"5\">Register Yourself </font></a></div></td>");
            out.println("<td width=\"15%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/aboutus.htm\"><font color=\"#FFFFFF\" size=\"5\">About ");
			out.println("Us</font></a></div></td>");
			out.println("</tr>");
			out.println("<tr> ");
			out.println("<td colspan=\"6\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
			out.println("<tr bgcolor=\"#0000CC\"> ");
            out.println("<td width=\"22%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/acc.htm\"><font color=\"#FFFFFF\" size=\"4\"> ");
			out.println("Accommodation</font></a></div></td>");
            out.println("<td width=\"21%\" bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travel.htm\"><font color=\"#FFFFFF\" size=\"4\"> ");
			out.println("Traveling Means</font></a></div>");
			out.println("<div align=\"center\"></div></td>");
            out.println("<td width=\"25%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travelguide.htm\"><font color=\"#FFFFFF\" size=\"4\">Travel ");
			out.println("Guide</font></a></div></td>");
            out.println("<td width=\"32%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travelinsurance.htm\"><font color=\"#FFFFFF\" size=\"4\">Travel ");
			out.println("Insurance</font></a></div></td>");
			out.println("</tr>");
			out.println("</table></td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("<table width=\"97%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
			out.println("<tr bgcolor=\"#3333FF\"> ");
            out.println("<td bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/car.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
			out.println("Car</font></a></div></td>");
            out.println("<td bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/train.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
			out.println("Train</font></a></div></td>");
            out.println("<td bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/flight.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
			out.println("Flight</font></a></div></td>");
            out.println("<td bgcolor=\"3399FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/cruise.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
			out.println("Cruises</font></a></div></td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("<h1 align=\"center\"><font color=\"#660033\">hcutravels Cruise Ships </font></h1>");
			out.println("<table width=\"733\" height=\"304\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">");
			out.println("<tr> ");
			out.println("<td height=\"33\" colspan=\"2\"><div align=\"center\"><img src=\"http://localhost:2008/hcutravels/images/headingcruises.gif\" width=\"604\" height=\"21\"></div></td>");
			out.println("</tr>");
			out.println("<tr> ");
			out.println("<td width=\"145\" height=\"242\" valign=\"top\" bgcolor=\"#0099FF\"> ");
			out.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
			out.println("<tr> ");
			out.println("<td bgcolor=\"#FFFFCC\" class=\"style11\"> <div align=\"center\"><strong><a href=\"http://localhost:2008/hcutravels/new.htm\">New 2 Cruising </a></strong></div></td>");
			out.println("</tr>");
			out.println("<tr> ");
            out.println("<td bgcolor=\"#FFFFCC\" class=\"style11\"> <div align=\"center\"><strong><a href=\"http://localhost:2008/hcutravels/logincruise.htm\">Book Cruises</a></strong></div></td>");
			out.println("</tr>");
			out.println("<tr> ");
			out.println("<td bgcolor=\"#FFFFCC\" class=\"style11\">            <div align=\"center\" class=\"style12\"></div>            </td>");
			out.println("</tr>");
			out.println("<tr> ");
            out.println("<td bgcolor=\"#FFFFCC\" class=\"style11\"> <div align=\"center\" class=\"style12\"><a href=\"http://localhost:2008/hcutravels/occasion.htm\">Special Occasions </a></div></td>");
			out.println("</tr>");
			out.println("<tr> ");
			out.println("<td bgcolor=\"#FFFFCC\" class=\"style11\"> <div align=\"center\"><strong><a href=\"http://localhost:2008/hcutravels/faqc.htm\">FAQ's</a></strong></div></td>");
			out.println("</tr>");
			out.println("<tr> ");
			out.println("<td bgcolor=\"#FFFFCC\" class=\"style11\"> <div align=\"center\"><strong><a href=\"http://localhost:2008/hcutravels/Cruise%20Protection%20Plan.htm\">Cruise Protection Plan </a></strong></div></td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("<p class=\"style11\"><img src=\"http://localhost:2008/hcutravels/images/celebrity_2.jpg\" width=\"145\" height=\"31\"></p>");
			out.println("<p class=\"style11\"><img src=\"http://localhost:2008/hcutravels/images/carnival_2.jpg\" width=\"144\" height=\"31\"></p></td >");
			out.println("<td width=\"588\"><table width=\"100%\" height=\"278\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" background=\"\">");
			out.println("<tr bgcolor=\"#FFCCFF\"> ");
			out.println("<td height=\"49\" colspan=\"2\"> <div align=\"center\">");
			out.println("<p><font color=\"#660033\" size=\"5\">Online Cruise Booking </font></p>");
			out.println("</div></td>");
			out.println("</tr>");
			out.println("<tr> ");
			out.println("<td width=\"70%\"><table width=\"100%\" height=\"220\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">");
			out.println("<tr bgcolor=\"#FFCCFF\">");
			out.println("<td>");
			out.println("<div align=\"center\"><strong><font color=\"#660033\" size=\"5\">Booking Confirmation</font></strong></div></td>");
			out.println("</tr>");
			out.println("<tr bgcolor=\"FFCCFF\">");
			out.println("<td width=\"51%\"><div align=\"center\"><font size=\"4\"><strong>Your request no. is </strong>"+reqno+" </font></div></td>");
			out.println("</tr>");
			out.println("<tr bgcolor=\"FFCCFF\">");
			out.println("<td><div align=\"center\"><font size=\"4\">Your ticket booking details would be</font></div></td>");
			out.println("</tr>");
			out.println("<tr bgcolor=\"#FFCCFF\">");
			out.println("<td height=\"72\">");
			out.println("<div align=\"center\" >");
			out.println("<p><font size=\"4\">sent to you within 3 days on your mail ID</font></p>");
			out.println("<p><font color=\"#663300\" size=\"5\">Thanx for using the sevice</font></p>");
			out.println("</div></td>");
			out.println("</tr>");
			out.println("</table></td>");
			out.println("<td width=\"30%\"><img src=\"http://localhost:2008/hcutravels/images/cruises-celebrity.jpg\" width=\"200\" height=\"229\"></td>");
			out.println("</tr>");
			out.println("</table></td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("<p align=\"center\">&nbsp;</p>");
			out.println("<hr size=1 width=\"70%\">");
            out.println("<p align=\"center\"> <a href=\"http://localhost:2008/hcutravels/new.htm\">New 2 Cruising</a>| <a href=\"http://localhost:2008/hcutravels/logincruise.htm\">Book Cruises</a>|  <a href=\"http://localhost:2008/hcutravels/occasion.htm\">Special Occasions|</a> <a href=\"http://localhost:2008/hcutravels/faqc.htm\">FAQ's</a> | <a href=\"http://localhost:2008/hcutravels/Cruise%20Protection%20Plan.htm\">Cruise ProtectionPlan</a> </p>");
			out.println("<div align=\"center\"><FONT face=\"Arial, Helvetica, sans-serif\"><A ");
            out.println("href=\"http://localhost:2008/hcutravels/home.htm\"><FONT ");
			out.println("size=3>Home</FONT></A></FONT></div>");
			out.println("<hr size=1 width=\"70%\">");
			out.println("<p align=\"center\"><img src=\"http://localhost:2008/hcutravels/images/twisting_cranberry_wht.jpg\" width=\"300\" height=\"30\"></p>");
			out.println("</body>");
			out.println("</html>");
			
            
           }catch(Exception e){
            	out.println("Exception"+e.getMessage()+e.toString());
            }
            finally{
            	try{
            		if(c!=null)
            			c.close();
            	}catch(Exception e){
            		out.println("Exception closing the connection"+e.getMessage());
            	}
            }
   		}
   }
   
