console.log("This is JavaScript");

console.log(heading1);
console.log(heading1.innerText);
let changeH1 = 'H1';
heading1.innerText = changeH1;
let addHtml = `
    <marquee><h1>This is Moving H1</h1></marquee>
`;
heading1.innerHTML = addHtml;

function editPrompt() {
    let namaPrompt = prompt('Masukkan nama anda', undefined);
    let alamatPrompt = prompt('Masukkan alamat anda', undefined);
    nama.innerHTML = namaPrompt;
    alamat.innerHTML = alamatPrompt;
}

function deleteConfirm() {
    let confirmation = confirm('Are You Sure?');
    console.log(confirmation);
}

let containers = document.getElementsByClassName('container');
console.log(containers);
