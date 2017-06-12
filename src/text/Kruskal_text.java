package text;

public class Kruskal_text {
	
	
	public static String kruskal(int[][] arcs) {
		
		String a = "";
		//�������
		int num = arcs.length;
		//��Ŷ�Ӧ����������ͨͼ��ʶ
		int[] group = new int[num];   //�Զ���ֵΪ0
		
		int n1 = 0, n2 = 0;
		boolean finished = false;
		int groupNum = 1;

		while(!finished) 
		{
			int min = Integer.MAX_VALUE;
			
			//�ҳ����б��е���Сֵ
			for(int i = 0; i < num; i++) 
			{
				for(int j = i+1; j < num; j++) 
				{
					if(arcs[i][j] > 0 && arcs[i][j] < min)
					{
						//���group��ͬ�����ʾ�����������ͬ��Ϊ0����ʾû�����
						if (group[i] != group[j] || (group[i] == 0 && group[j] == 0)) 
						{
							min = arcs[i][j];     //�ҵ�������С����������
							n1 = i;
							n2 = j;    
						}                                            
					}
				}
			}
	    
			if(min == Integer.MAX_VALUE)
			{
				continue;        //���벻�ɴ�����
			}
	    
			System.out.println(n1 + " ---> " + n2 + " " + min);
			a+= n1 + " ---- " + n2 + "    ";
	    
			if(group[n1] == 0 && group[n2] == 0)//���������û������������ͨ��ǣ����Ϊͬһ����
			{
				group[n1] = groupNum;
				group[n2] = groupNum;
				groupNum++;
			}
			else if(group[n1] > 0 && group[n2] > 0)  //�������㣬����������㶼�ֱ����������㣬�����������ֵ����ͬһ������
			{
				int tmp = group[n2];
				for(int m = 0; m < group.length; m++)
				{
					if(group[m] == tmp)
					{
						group[m] = group[n1];
					}
				}
			}
			else                                    //���һ������0��һ�����ǣ������0�Ķ��㸳�ɲ���0���Ǹ�
			{
				if(group[n1] == 0)
				{
					group[n1] = group[n2];
				}
				else
				{
					group[n2] = group[n1];
				}
			}
	    
			for(int i = 0; i < group.length; i++) 
			{
				if(group[i] != group[0])
				{
					finished = false;
					break;
				}
				else
				{
					finished = true;
				}
			}
	    
			if(finished) 
			{
				break;
			}
		}
		return a;
	}

}
