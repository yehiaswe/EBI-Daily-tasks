function calculatethis(x)
{
    document.getElementById("display").value += x;
}

function dltths(x)
{
    document.getElementById("display").value = x;
}

function resultis()
{
    let kk=document.getElementById("display").value;
    document.getElementById("display").value = eval(calculator.display.value);
    alert("result of  "+kk+"  equals  " + eval(calculator.display.value));
    dltths('');
}