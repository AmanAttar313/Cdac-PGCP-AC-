import prompt from "prompt";

prompt.start();
 prompt.get(['username', 'password'], function (err, result) {
    //
    // Log the results.
    //
    console.log('Enter name : ');
    console.log('  username: ' + result.username);
    console.log('Enter password : ');

    console.log('  password: ' + result.password);
  });