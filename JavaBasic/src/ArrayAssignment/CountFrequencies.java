package ArrayAssignment;

public class CountFrequencies {

	public static void main(String[] args) {
		int num[]= {100,1,2,7,5,4,3,2,100};
		CountFrequencies cf=new CountFrequencies();
		cf.findFrequencies(num);
	}
	void findFrequencies(int[] num) {
		int []fr=new int[num.length];
		int visit=-1;
		for(int i=0;i<num.length;i++) {
			int count=1;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					count++;
					fr[j]=visit;
				}
			}
			if(fr[i]!=visit)
				fr[i]=count;	
		}
		for(int k=0;k<fr.length;k++) {
			if(fr[k]!=visit) {
				System.out.println(num[k]+":"+fr[k]);
			}
		}
	}
}
