/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
private:
    vector<vector<int>> res;
public:
    Solution():res(0){};
    vector<vector<int>> levelOrder(TreeNode* root) {
        if(root == nullptr){
            return res;
        }
        dep(root,0);
        return res;
    }
    void dep(TreeNode* root,int depth){
        if(root != nullptr){
            if(depth >= res.size()){
                res.resize(depth+1);
            }
            int nowNum = res[depth].size();  
            res[depth].resize(nowNum);
            res[depth].push_back(root->val);
            dep(root->left,depth+1);
            dep(root->right,depth+1);
        }
    }
};