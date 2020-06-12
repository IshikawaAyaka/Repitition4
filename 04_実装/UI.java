package typingGame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UI {

	//�R���X�g���N�^
	public UI() {
	}

	//�����̕������\��
	public void showString(String correctString) {
		System.out.println("--------");
		System.out.println(correctString);
		System.out.println("--------");
	}

	//���v���Ԃ�\��
	public void showTime(double time) {
		System.out.println("TIME�F" + time + "�b");
	}

	//�]����\��
	public void showAssessement(String assessment) {
		System.out.println("�]���F" + assessment);
	}

	//�ԈႢ��\��
	public void showMistake(String message) {
		System.out.println(message);
	}

	//�J�n����
	public void showReady() {
        System.out.println("Ready? (ENTER�L�[�������ĊJ�n)");
        try{
            System.in.read();
        }catch(Exception e){
            e.printStackTrace();
        }
	}

	//�^�C�s���O
	public String typing() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
			return input;
		}catch(Exception e) {
			return null;
		}

	}

	//���[�h�̑I��
	public int selectMode() {
		System.out.println("���[�h��I�����Ă�������");
		System.out.println("-----------------");
		System.out.println("* ���͗� : 1:EASY, 2:HARD");
		int ret;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String input = reader.readLine();
				ret = Integer.parseInt(input);
			return ret;

		}catch(Exception e) {
			ret = -1;
			return ret;
		}
	}

}
