package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		//HttpServlet http=new LoginService() 
		method(new LoginService());
		
		//HttpServlet http=new FileDownloadService()
		method(new FileDownloadService());

	}
	
	//�޼ҵ� Ȱ��
	public static void method(HttpServlet http){
		http.service();
	}

}
