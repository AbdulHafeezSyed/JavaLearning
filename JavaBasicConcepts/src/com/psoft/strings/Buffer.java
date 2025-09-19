package com.psoft.strings;

public class Buffer {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		StringBuffer st=new StringBuffer();
//		//System.out.println(st.capacity());
//        st.append("abdul");
//        st.reverse();
//        System.out.println(st);

//		StringBuilder sb = new StringBuilder("Hello");
////		System.out.println("start  : " + sb + " | len=" + sb.length() + " cap=" + sb.capacity());
//		sb.append(", ").append("Builder!");
//      System.out.println("append()          : " + sb);
//		// sb.insert(5, " awesome");
//		// System.out.println("insert() : " + sb);
//		// sb.delete(5, 14); // remove " awesome"
//		// System.out.println("delete() : " + sb);
//        sb.replace(7, 14, "World");
//        System.out.println("replace()         : " + sb);
//       sb.setCharAt(4, 'O');
//        System.out.println("setCharAt()       : " + sb);
////        sb.reverse();
////        System.out.println("reverse()         : " + sb);
////        sb.reverse(); // back to normal
//sb.ensureCapacity(50);
//System.out.println("ensureCapacity(): cap=" + sb.capacity());
//    String built = sb.toString();
//	 System.out.println("toString() : " + built);
		StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(", ").append("Buffer!");
        sbf.insert(5, " awesome");
        sbf.delete(5, 14);
        sbf.replace(6, 12, "World");
        sbf.setCharAt(0, 'h');
        System.out.println("Buffer result:" + sbf);
        System.out.println("length/capacity: len=" + sbf.length() + " cap=" + sbf.capacity());
	}
}
