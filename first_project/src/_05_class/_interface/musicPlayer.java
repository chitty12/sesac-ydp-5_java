package _05_class._interface;

interface Music {
	void play(String song);
	void stop(String song);
	
}


class MP3Player implements Music{

	@Override
	public void play(String song) {
		System.out.printf("MP3 플레이어에서 '%s' 음악을 재생합니다\n", song);
		
	}

	@Override
	public void stop(String song) {
		System.out.printf("MP3 플레이어에서 '%s' 음악을 정지합니다\n", song);
		
	}
	
}


class CdPlayer implements Music{

	@Override
	public void play(String song) {
		System.out.printf("CD 플레이어에서 '%s' 앨범을 재생합니다\n", song);
		
	}

	@Override
	public void stop(String song) {
		System.out.printf("CD 플레이어에서 '%s' 앨범을 정지합니다\n", song);
		
	}
	
}



public class musicPlayer{
	
	public static void main(String[] args) {
		MP3Player Mp3 = new MP3Player();
		System.out.println("===MP3Player===");
		Mp3.play("아이유 블루밍");
		Mp3.stop("아이유 블루밍");
		
		
		CdPlayer CD = new CdPlayer();
		System.out.println("===CDPlayer===");
		CD.play("아이유 꽃갈피");
		CD.stop("아이유 꽃갈피");
		}
	
}


