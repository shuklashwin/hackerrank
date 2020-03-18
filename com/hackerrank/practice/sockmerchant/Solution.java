package com.hackerrank.practice.sockmerchant;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int result = 0;
		Map<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < n; index++) {
			int count = 0;
			int element = ar[index];

			if (map.containsKey(element)) {
				count = map.get(element);
			}
			map.put(element, count + 1);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int floorDiv = entry.getValue() / 2;
			if (floorDiv > 0) {
				result += floorDiv;
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		int n = 9;
		int[] ar = new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 };

		int result = sockMerchant(n, ar);

		System.out.println(result);
	}
}
