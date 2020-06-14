import java.util.*;

//This finds which two numbers add up to the target and returns the indices.
//Our target is 10. 4 and 6 are the answer because they add to 10.
public class findSum{
	public static void main(String[] args) {
		
		//Test array and target
		//Doesn't matter which numbers we use so long as there is a solution
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int target = 10;
		
		//Remember, this we are finding the indices of the answer
		int [] answer = coupleSum(numbers, target);
		
		System.out.println("Our target number is: " + target);
		System.out.println(answer[0] + " + " + answer[1] + " = " + target);
	}
	
	
	public static int[] coupleSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
		//Iterate through the array 
		for(int i = 0; i <= numbers.length; i++){
			
			//Read else first
			//If we find the answer then return the indices.
			if(map.containsKey(numbers[i])){
				return new int[]{map.get(numbers[i]), i + 1};
				
				
			//If the number isn't in the map already
			//Put into the map, and the target - current number.
			//We do target - current number to give us a possible answer.
			//EX 10 - 3 = 7. Therefore if 7 comes up in the array we have an answer.
			}else{
				map.put(target - numbers[i], i + 1);
			}
		}
		
		//If there is no answer return this.
		return new int[]{0,0};    
    }
}

