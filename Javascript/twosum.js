function twoSum(nums, target){
    var result=[];
    var len = nums.length;
        for(var i=0;i<len;i++){
            result.push(i);
            if(nums.indexOf(target-nums[i])!=-1 && nums.indexOf(target-nums[i])!=i ){
                result.push(nums.indexOf(target-nums[i]));
                return result;            
            }
             result.pop();
        }
        return null;
};


    