Round 1:
Hackerrank Test(27.08.2025)
1. Class Inheritance: Wrong
2. BVA : Right
3.  <details>  <summary>SQL :Right</summary>Select Department, Count(*) FROM Employees GROUP BY Department
</details>

4. <details><summary>Code 1 :Right</summary> user id , actions, m ; if session is more than 1 then minus;
<details> <summary> Code</summary>
```java 
Set<String> l= new HashSet<>();
HashMap<String, Integer> h = new HashMap<>();
for(int i=0;i<userIds.size();i++){
  if(actions.get(i).equals("login") & h.containsKey(userIds.get(i))){
    h.put(userIds.get(i), h.get(userIds.get(i))+1);
    if(h.get(userIds.get(i))>m){
      l.add(userIds.get(i));
    }
  }
  else if(actions.get(i).equals("logout") & h.containsKey(userIds.get(i))){
    if(h.get(userId.get(i))>0){
        h.put(userIds.get(i), h.get(userIds.get(i))-1);
    }
    if(h.get(userIds.get(i))>m){
      l.add(userIds.get(i));
    }
  }
  else{
    h.put(userIds.get(i), 1);
  }
}

List<String> limit = new ArrayList<>(l);
return limit;
</details>

5. Code 2 : Not Attempted