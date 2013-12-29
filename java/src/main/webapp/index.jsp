<html>
<head>
  <title>Roman Numeral Converter</title>
  <script>
  function doConversion() {
    $.ajax({
      url: '/roman',
      data: 'n='+$('#num').val(),
      success: function(data) { $("#roman-num").html(data); },
      error: function(data) { $("#roman-num").html('ERROR'); }
    });
  }

  </script>
  <style>
  .input {
    font-size:.5em;
  }
  .button {
    font-size: .5em;
    -webkit-appearance: none;
  }
  </style>
</body>
</head>
<body style="font-size: 5em; -webkit-font-smoothing: subpixel-antialiased;">
  <div>Roman Numeral Converter</div>
  <input type="text" class="input" id="num">
  <input type="button" class="button" onclick="doConversion();"  value="Convert">
  => <span id="roman-num"/>
  <script src="http://code.jquery.com/jquery-latest.min.js"></script>
</html>