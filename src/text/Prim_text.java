package text;

public class Prim_text {
	 
	 public String prim(int n,int [][]w)
	 {
		 String a="";
		 int verNum = w.length;        //�������
		 int []lowerW = new int[verNum];       //���ҵ����㵽���������СȨֵ
		 int []edge = new int[verNum];        //������
		 boolean []checked = new boolean[verNum];  //�ж��Ƿ����
		  checked[1]=true;            		//��ȡ��һ������	  
		  for(int i=1; i<=n; i++)
		  {          
			  lowerW[i] = w[1][i];          //��ʼ�����㼯�ϣ���һ���㵽������ľ�����Ϊ��֪�㵽δ֪�����С����
			  edge[i] = 1;
			  checked[i] = false;
		  }
		  
		  for(int i=1;i<=n;i++)
		  {	  
			  int min=Integer.MAX_VALUE;
			  int j=1;
			  for(int k=2;k<=n;k++)
			  {        
				  if(lowerW[k] < min && (!checked[k]))   //�жϸĵ��Ƿ�ɴ���Ƿ��ȡ�ö���
				  {
					  min = lowerW[k];          //����С����ĸ���min��ֱ���ҵ���С�ľ��룬
					  j = k;                   //j���ҳ����뵱ǰi���������С�Ķ���
				  }
			  }
			  
			  if(i < n)                //���������һ�����㵽��һ����������
			  {
				  System.out.println(j + "-->" + edge[j]);
				  a+=j + "-->" + edge[j]+"     ";
			  }
		    
			  checked[j] = true;           //��������뵽�¼����У�˵���ö����ѱ����ʹ�
		     
			  for(int k = 2 ; k<=n ; k++)
			  {        //�ж������ӵĵ㵽����ľ����Ƿ�С�ڸõ����СȨֵ
				  if((w[j][k] < lowerW[k] ) && ( !checked[k] ))
				  {
					  lowerW[k] = w[j][k];           //�������ӵ��Ǹ�����,����������ֵ����lowerW[]
					  edge[k] = j;				   
				  }
			  }
			 
		  }
		  return a;
	}

}
