let list:number [] = [];
let i:number = 1;


function dividi(i:number, j:number){
    while(i%j == 0){
        i = i / j;
    }
    return i;

}

function ifUgly(i:number):number{
    i = dividi(i,2);
    i = dividi(i,3);
    i = dividi(i,5);

    return(i==1) ? 1 : 0;
}

while(list.length !=1500){ 
    if(i == 1){
        list.push(i);
        i++;
    }
    else{
        if(ifUgly(i)==1){
            list.push(i);
        }
        i++;
    }
    
}

console.log(list[1499]);