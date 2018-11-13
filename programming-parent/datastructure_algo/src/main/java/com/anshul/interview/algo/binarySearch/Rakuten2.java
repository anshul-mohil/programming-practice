package com.anshul.interview.algo.binarySearch;

import java.util.Arrays;

public class Rakuten2 {

public static int Solution2(int[] a){
  int n = a.length;
  int result = 0;

  //Arrays.sort(a);
  for(int P = 0; P < n; P++){
    for(int Q = P+1; Q < n; Q ++){
      if(a[P] <= a[Q]) {
        result = Math.max(result, Q - P);
      }
    }
  }
  return result;
}

  public static void main(String[] args) {
    int A[] = {1, 4, 7, 3, 3, 5};
    System.out.println(Solution2(A));
  }


//  class find_adjacent_pair {
//    public:
//
//    find_adjacent_pair();
//       ~
//
//    find_adjacent_pair();
//
//    void print_adjacent_pairs(int*);
//
//    private:
//    map<int, vector<int>> mymap;
//
//    void map_input(int*);
//
//    void add_new_entry(int, int);
//
//    void compute_self_pair(vector<int>);
//
//    void compute_neighbour_pair(vector<int>, vector<int>);
//  }
//
//  ;
//
//  find_adjacent_pair::
//
//  find_adjacent_pair() {
//    mymap.clear();
//  }
//
//  find_adjacent_pair::~
//
//  find_adjacent_pair() {
//    mymap.clear();
//  }
//
//  void find_adjacent_pair::
//
//  print_adjacent_pairs(int*in) {
//    map<int, vector<int>>::iterator its;
//    map<int, vector<int>>::iterator itd;
//
//
//    map_input(in);
//
//    //key in the map is already sorted
//    its = mymap.begin();
//    compute_self_pair(its -> second);
//    while (its != mymap.end()) {
//      itd = its;
//      its++;
//      compute_self_pair(its -> second);
//      compute_neighbour_pair(itd -> second, its -> second);
//    }
//  }
//
//  void find_adjacent_pair::
//
//  map_input(int*in) {
//    int *ptr, val, pos;
//    map<int, vector<int>>::iterator it;
//
//    ptr = in;
//    pos = 0;
//
//    while (ptr != NULL) {
//      val = *ptr;
//      it = mymap.find(val);
//      if (it != mymap.end()) it -> second.push_back(pos);
//      else add_new_entry(val, pos);
//      ptr++;
//      pos++;
//    }
//
//  }
//
//  void find_adjacent_pair::
//
//  add_new_entry(int value, int pos) {
//    vector<int> ps;
//    ps.push_back(pos);
//    mymap.insert(pair < int,vector<int>>(value, ps));
//  }
//
//  void find_adjacent_pair::
//
//  compute_self_pair(vector<int> ps) {
//
//    vector<int> ::iterator it;
//    vector<int> ::iterator itv;
//    int i = 0;
//
//    for (itv = ps.begin(); i < ps.size() - 1; itv++) {
//      for (it = itv + 1; it != ps.end(); it++)
//        cout << "(" <<*itv << ", " <<*it << ")  ";
//      i++;
//    }
//  }
//
//  void find_adjacent_pair::
//
//  compute_neighbour_pair(vector<int> ps1, vector<int> ps2) {
//    vector<int> ::iterator it1;
//    vector<int> ::iterator it2;
//
//    for (it1 = ps1.begin(); it1 != ps1.end(); it1++)
//      for (it2 = ps2.begin(); it2 != ps2.end(); it2++)
//        cout << "(" <<*it1 << ", " <<*it2 << ") ";
//
//  }
}
