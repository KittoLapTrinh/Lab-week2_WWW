body {
    background: url('../img/backgroudDN.jpg');
    background-size: cover;
    background-position-y: -80px;
    font-size: 16px;
}

#wrapper {
    min-height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
}

#form-login {
    max-width: 400px;
    background: rgba(0, 0, 0, 0.8);
    flex-grow: 1;
    padding: 30px 30px 40px;
    box-shadow: 0px 0px 17px 2px rgba(255, 255, 255, 0.8);
}

.form-heading {
    font-size: 25px;
    color: #f5f5f5;
    text-align: center;
    margin-bottom: 30px;
}

.form-group {
    border-bottom: 1px solid #fff;
    margin-top: 15px;
    margin-bottom: 20px;
    display: flex;
}

.form-group i {
    color: #fff;
    font-size: 14px;
    padding-top: 5px;
    padding-right: 10px;
}

.form-input {
    background: transparent;
    border: 0;
    outline: 0;
    color: #f5f5f5;
    flex-grow: 1;
}

.form-input::placeholder {
    color: #f5f5f5;
}

#eye i {
    padding-right: 0;
    cursor: pointer;
}

.form-submit {
    background: transparent;
    border: 1px solid #f5f5f5;
    color: #fff;
    width: 100%;
    text-transform: uppercase;
    padding: 6px 10px;
    transition: 0.25s ease-in-out;
    margin-top: 30px;
}

.form-submit:hover {
    border: 1px solid #54a0ff;
    cursor: pointer;
}

#thoat {
    background: transparent;
    border: 0px;
    width: 20px;
    margin-left: 470px;
    cursor: pointer;
}