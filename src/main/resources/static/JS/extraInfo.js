/**
 * 
 */
 function insertText() {
     var total = document.getElementById('total');
     var text = document.createTextNode("$");
     total.prependChild(text);
 }