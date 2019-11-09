import java.util.*;

public class DecToBinarySort{

	public static void main(String[] args) {

		int[] e = {1, 1, 1, 1};
		System.out.println(Arrays.toString(rearrange(e)));

	}

	static int[] rearrange(int[] elements) {

		Arrays.sort(elements);

		String[] temp = new String[elements.length];
		int j = 0;
		for (int i = 0; i < elements.length; i++) {

			if (i < elements.length - 1 && elements[i] == elements[i+1]) {
				temp[j] = Integer.toBinaryString(elements[i]);
				i++;
				j++;
				continue;
			}
//			System.out.println(i);
			temp[j] = Integer.toBinaryString(elements[i]);
			j++;
		}

		int newArraySize = j;

		int i = 0;
		int[] getOnesCount = new int[newArraySize];
		while (i < newArraySize) {
			int count = 0;
			for(int k = 0; k < temp[i].length(); k++) {
				if (temp[i].charAt(k) == '1') {
					count++;
				}
			}
			getOnesCount[i] = count;
			i++;
		}

		HashMap<Integer, ArrayList<String>> hm = new HashMap<Integer, ArrayList<String>>();

		for (int l = 0; l < getOnesCount.length; l++ ) {
			if(hm.containsKey(getOnesCount[l])) {
				hm.get(getOnesCount[l]).add(temp[l]);
			} else {
				ArrayList<String> tmp = new ArrayList<String>();
				tmp.add(temp[l]);
				hm.put(getOnesCount[l],tmp);
			}
		}

		System.out.println(hm);
		System.out.println(Arrays.toString(getOnesCount));

		ArrayList<Integer> tmpRes = new ArrayList<Integer>();
		Arrays.sort(getOnesCount);
		for( int m = 0; m < getOnesCount.length; m++) {
			if(hm.containsKey(getOnesCount[m])) {

				ArrayList<String> tmp2 = hm.get(getOnesCount[m]);
				System.out.println(tmp2);
				int sizeList = tmp2.size();
				int[] num = new int[sizeList];
				for(int n = 0; n < num.length; n++) {
					num[n] = Integer.parseInt(tmp2.get(n),2);
				} 
				//Arrays.sort(num);
				for( int q = 0; q < num.length; q++) {
					tmpRes.add(num[q]);
				}
				hm.remove(getOnesCount[m]);
			}
		}

		int[] res = new int[tmpRes.size()];
		for(int r = 0; r < res.length; r++) {
			res[r] = tmpRes.get(r);
		}

		Arrays.sort(res);

		return res;
    }
}