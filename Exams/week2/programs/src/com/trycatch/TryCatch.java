package com.trycatch;

public class TryCatch {

	public static void main(String[] args) throws Exception{
		
		try (Player player = new Player()) { //Try with resources
			System.out.println(player);
			throw new UnsupportedOperationException();
		}catch (UnsupportedOperationException e) {
			System.out.println("Error intencional");
			e.printStackTrace();
		}finally{
			try{ //simple try without resources
				Player player = new Player();
				System.out.println(player);
				throw new UnsupportedOperationException();
			}catch (UnsupportedOperationException e) {
				System.out.println("Error intencional");
				e.printStackTrace();
			}
		}/*catch(Exception e) {
		}
			System.out.println("Error from Player class");
			e.printStackTrace();
		}*/
		
	}
	

}
