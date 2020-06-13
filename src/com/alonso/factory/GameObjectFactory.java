package com.alonso.factory;

import com.alonso.object.BigPlane;
import com.alonso.object.BossBullet;
import com.alonso.object.BossPlane;
import com.alonso.object.BulletGoods;
import com.alonso.object.GameObject;
import com.alonso.object.MiddlePlane;
import com.alonso.object.MissileGoods;
import com.alonso.object.MyBullet;
import com.alonso.object.MyBullet2;
import com.alonso.object.MyPlane;
import com.alonso.object.SmallPlane;

import android.content.res.Resources;

/*��Ϸ����Ĺ�����*/
public class GameObjectFactory {
	//����С�͵л��ķ���
	public GameObject createSmallPlane(Resources resources){
		return new SmallPlane(resources);
	}
	//�������͵л��ķ���
	public GameObject createMiddlePlane(Resources resources){
		return new MiddlePlane(resources);
	}
	//�������͵л��ķ���
	public GameObject createBigPlane(Resources resources){
		return new BigPlane(resources);
	}
	//����BOSS�л��ķ���
	public GameObject createBossPlane(Resources resources){
		return new BossPlane(resources);
	}
	//������ҷɻ��ķ���
	public GameObject createMyPlane(Resources resources){
		return new MyPlane(resources);
	}
	//��������ӵ�
	public GameObject createMyBullet(Resources resources){
		return new MyBullet(resources);
	}
	//��������ӵ�
	public GameObject createMyBullet2(Resources resources){
		return new MyBullet2(resources);
	}
	//����BOSS�ӵ�
	public GameObject createBossBullet(Resources resources){
		return new BossBullet(resources);
	}
	//����������Ʒ
	public GameObject createMissileGoods(Resources resources){
		return new MissileGoods(resources);
	}
	//�����ӵ���Ʒ
	public GameObject createBulletGoods(Resources resources){
		return new BulletGoods(resources);
	}
}
