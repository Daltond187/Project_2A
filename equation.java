public int equation(Integer left, Integer right, String s) {
    switch(s) {
        
    case "+":
        return(left + right);
        break;
    
    case "-":
        return(left - right);
        break;
        
    case "*":
        return(left * right);
        break;
        
    case "/":
        return(left / right);
        break;
        
    case "^":
        return(Math.pow(left, right));
        break;
        
    case ">":
        if(left > right) {
            return 1;
        }
        else {
            return 0;
        }
        break;
        
    case "<":
        if(left < right) {
            return 1;
        }
        else {
            return 0;
        }
        break;
        
    case ">=":
        if(left >= right) {
            return 1;
        }
        else {
            return 0;
        }
        break;
        
    case "<=":
        if(left <= right) {
            return 1;
        }
        else {
            return 0;
        }
        break;
        
    case "==":
        if(left == right) {
            return 1;
        }
        else {
            return 0;
        }
        break;
        
    case "!=":
        if(left != right) {
            return 1;
        }
        else {
            return 0;
        }
        break;
        
    case "&&":
        if(left && right) {
            return 1;
        }
        
        else {
            return 0;
        }
    break;
    
    case "||":
        if(left || right) {
            return 1;
        }
        
        else {
            return 0;
        }
    break;
}
