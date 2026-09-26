/*
// Definition for Employee.
class Employee {
public:
    int id;
    int importance;
    vector<int> subordinates;
};
*/

class Solution {
public:
    unordered_map<int,Employee*>emp;
    int total=0;
    int dfs(int id){
        total+=emp[id]->importance;

        for(int a:emp[id]->subordinates){
            dfs(a);
        }
        return total;
    }
    int getImportance(vector<Employee*> employees, int id) {
        for(Employee* it:employees){
            emp[it->id]=it;
        }
        return dfs(id);
    }
};