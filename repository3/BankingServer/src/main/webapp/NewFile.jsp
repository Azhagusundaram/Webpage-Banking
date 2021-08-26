<!-- <!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <title>zohoregistration</title>
    <style>
       input[type=text] {
            border:hidden;
         border-bottom: 1px solid black;
         outline:none;
        }

input[type=text]:focus {
  border-bottom:1px solid blue;
  box-shadow: 0px 1px blue;
}
textarea{
outline:none;
}
textarea:focus{
 border:2px solid blue;
}
    </style>
</head>
<body>
<h1 align="center">WELCOME TO ZOHO</h1>
<center><img src="https://zohowebstatic.com/sites/default/files/ogimage/zoho-logo.png" alt="Zoho Corporation" width="100" height="100" style="align:center"></center>
<h2 align="center">Registration Form</h2>
<form action="Hello" method="post"onsubmit="if(document.getElementById('agree').checked) { return true; } else { alert('Please indicate that you have read and agree to the Terms and Conditions and Privacy Policy'); return false; }">
    <table id="table1"; cellspacing="5px" cellpadding="5%"; align="center" border="0">
        <tr>
            <td>
                <label for="emailid">Email Id</label>
            </td>
            <td>:</td>
            <td>
                <input type="text" id="emailid" name="emailid" placeholder="Email Id"required>
            </td>
        </tr>
        <tr>
            <td>
                <label for="phone">Mobile Number</label>
            </td>
            <td>:</td>
            <td>
                <input type="text" id="phone" name="phone"placeholder="Mobile Number"required>
            </td>
        </tr>
        <tr>
            <td>
                <label>Gender</label>
            </td>
            <td>:</td>
            <td>
                <input type="radio" id="male" name="gender" value="Male"checked="checked">
                <label for="male">Male</label>
                <input type="radio" id="female" name="gender" value="Female">
                <label for="female">Female</label>
                <input type="radio" id="other" name="gender" value="Other">
                <label for="other">Other</label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="country">Country</label>
            </td>
            <td>:</td>
            <td>
                <select name="country" id="country"required>
                    <option value="country">Select Country</option>
                    <option value="india">India</option>
                    <option value="america">America</option>
                    <option value="canada">Canada</option>
                    <option value="united kingdom">United Kingdom</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
                <label>Coding Language</label>
            </td>
            <td>:</td>
            <td>
                <input type="checkbox" id="language1" name="language1" value="Java">
                <label for="language1"> Java</label>
                <input type="checkbox" id="language2" name="language2" value="HTML">
                <label for="language2"> HTML</label>
                <input type="checkbox" id="language3" name="language3" value="CSS">
                <label for="language3">CSS</label>
            </td>
        </tr>
        <tr>
            <td>
                <label for="comments">Comments</label>
            </td>
            <td>:</td>
            <td>
                <textarea id="comments" name="comments" rows="4" cols="25"placeholder="Comments"required></textarea>
            </td>
        </tr>
        <tr>
            <td colspan="3" >
                <input type="checkbox" name="checkbox" value="check" id="agree" /> I have read and agree to the <a href="https://www.zoho.com/en-in/terms.html">Terms and Conditions</a> <br>and Privacy Policy
            </td>
        </tr>
        <tr>
            <td align="right">
                <input type="submit" value="Submit">
            </td>
            <td></td>
            <td>
                <input type="reset" value="Reset">
            </td>
        </tr>
    </table>
</form>
</body>
</html> -->