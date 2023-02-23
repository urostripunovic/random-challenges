const letters = "abcdefghijklmnopqrstuvwxyz."

var numbers = [4, 18, 26, 6, 13, 0, 6, 19, 0, 14, 6];

function wordFactory(message, numbers) {
    if (numbers.length > 0) {
        message = message + letters[numbers.pop()];
        wordFactory(message, numbers);
    } else {
        console.log('www.' + message);
    }
}

wordFactory("", numbers);
