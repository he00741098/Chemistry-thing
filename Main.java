class Main {
  public static void main(String[] args) {
   
double initialA = 15;
		double initialB = 5;
		for(int i = 0; i<9; i++){
		System.out.println("Start at: "+(i+1));
			double tempAddB =(initialA*0.8);
			double tempAddA=((initialB*0.2));
			initialA-=tempAddB;
			initialB+=tempAddB;
			initialA+=tempAddA;
			System.out.println("Forward: "+tempAddB);
			System.out.println("New A: "+initialA);
			initialB-=tempAddA;
			System.out.println("Backward: "+tempAddA);
			System.out.println("New B: "+initialB);
			
		}

		
  }
}