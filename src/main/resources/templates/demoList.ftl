<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
</head>
<body>
    <h1>${message}</h1>

    <#list demoList as demo>
    <tr>
        <td>${demo.id}, ${demo.name}<td>
    </tr>
    </#list>

</body>
</html>