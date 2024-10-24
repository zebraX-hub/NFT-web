function infobox() {
    const infobox = document.getElementById('infobox');
    if (infobox.classList.contains('slide-in-left')) {
        infobox.classList.remove('slide-in-left');
        infobox.classList.add('slide-in-right');
    } else {
        infobox.classList.remove('slide-in-right');
        infobox.classList.add('slide-in-left');
    }
}


