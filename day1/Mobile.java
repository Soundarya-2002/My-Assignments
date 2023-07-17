package week1.day1;

public class Mobile {
	public void SendMessage() {
		System.out.println("SendMessage");
	}
	public void ShareDocument() {
		System.out.println("shareDocument");
	}
	public void MakeCal() {
		System.out.println("MakeCal");
	}
	public void Chatting() {
		System.out.println("chatting");
	}
	public void WatchingVideo() {
		System.out.println("WatchingVideo");
	}
	public void TakePhoto() {
		System.out.println("TakePhoto");
	}
	public static void main(String[] args) {
		Mobile myMobile= new Mobile();
		myMobile.SendMessage();
		myMobile.ShareDocument();
		myMobile.MakeCal();
		myMobile.Chatting();
		myMobile.WatchingVideo();
		myMobile.TakePhoto();
		
	}

}
