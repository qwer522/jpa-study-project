<template>
  <div class="page-wrapper">
  <!-- start page-title -->
  <section class="page-title">
    <div class="page-title-container">
      <div class="page-title-wrapper">
        <div class="container">
          <div class="row">
            <div class="col col-xs-12">
              <h2>로그인</h2>
              <ol class="breadcrumb">
                <li><a href="index.html">Home</a></li>
                <li>로그인</li>
              </ol>
            </div>
          </div> <!-- end row -->
        </div> <!-- end container -->
      </div>
    </div>
  </section>
  <!-- end page-title -->


  <!-- start my-account-section -->
  <section class="my-account-section">
    <div class="container-1410">
      <div class="row">
        <div class="col-xs-12">
          <div class="woocommerce">
            <div class="woocommerce-notices-wrapper"></div>
            <div class="u-columns col2-set" id="customer_login">
              <div class="u-column1 col-1">
                <h2>로그인</h2>
                <form class="woocommerce-form woocommerce-form-login login" method="post">
                  <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                    <label for="username">Username or email address&nbsp;<span class="required">*</span></label>
                    <input type="text" class="woocommerce-Input woocommerce-Input--text input-text" name="username" id="username" autocomplete="username" />
                  </p>
                  <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                    <label for="password">Password&nbsp;<span class="required">*</span></label>
                    <input class="woocommerce-Input woocommerce-Input--text input-text" type="password" name="password" id="password" autocomplete="current-password" />
                  </p>
                  <p class="form-row">
                    <label class="woocommerce-form__label woocommerce-form__label-for-checkbox woocommerce-form-login__rememberme">
                      <input class="woocommerce-form__input woocommerce-form__input-checkbox" name="rememberme" type="checkbox" id="rememberme" value="forever" /> <span>Remember me</span>
                    </label>
                    <input type="hidden" id="woocommerce-login-nonce" name="woocommerce-login-nonce" value="f0e969fd27" /><input type="hidden" name="_wp_http_referer" value="/my-account/" />               <button type="submit" class="woocommerce-button button woocommerce-form-login__submit" name="login" value="Log in">로그인</button>
                    <router-link to="/signup" tag="button" class="woocommerce-button">회원가입</router-link>
                  </p>
                  <p class="woocommerce-LostPassword lost_password">
                    <a href="http://proffer.themegeniuslab.com/my-account/lost-password/">Lost your password?</a>
                  </p>
                </form>
              </div>
              <div class="u-column2 col-2">
                <h2>일단 보류</h2>
                <form method="post" class="woocommerce-form woocommerce-form-register register"  >
                  <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                    <label for="reg_email">Email address&nbsp;<span class="required">*</span></label>
                    <input type="email" class="woocommerce-Input woocommerce-Input--text input-text" name="email" id="reg_email" autocomplete="email" />
                  </p>
                  <p>A password will be sent to your email address.</p>
                  <div class="woocommerce-privacy-policy-text">
                    <p>Your personal data will be used to support your experience throughout this website, to manage access to your account, and for other purposes described in our <a href="#" class="woocommerce-privacy-policy-link" target="_blank">privacy policy</a>.</p>
                  </div>
                  <p class="woocommerce-form-row form-row">
                    <input type="hidden" id="woocommerce-register-nonce" name="woocommerce-register-nonce" value="2361821e0b" /><input type="hidden" name="_wp_http_referer" value="/my-account/" />
                    <button type="submit" class="woocommerce-Button woocommerce-button button woocommerce-form-register__submit" name="register" value="Register">Register</button>
                  </p>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- end my-account-section -->


  <!-- start instagram-section -->
  <section class="instagram-section">
    <div class="container-1410">
      <div class="row">
        <div class="col col-xs-12">
          <div class="instagram-inner">
            <div class="instagram-text">
              <h3>Follow our instagram</h3>
              <p>@aviwp.studio</p>
            </div>
            <div class="instagram-grids clearfix">
              <div class="grid">
                <a href="#"><img src="images/instagram/1.jpg" alt></a>
              </div>
              <div class="grid">
                <a href="#"><img src="images/instagram/3.jpg" alt></a>
              </div>
              <div class="grid">
                <a href="#"><img src="images/instagram/4.jpg" alt></a>
              </div>
              <div class="grid">
                <a href="#"><img src="images/instagram/2.jpg" alt></a>
              </div>
              <div class="grid">
                <a href="#"><img src="images/instagram/5.jpg" alt></a>
              </div>
              <div class="grid">
                <a href="#"><img src="images/instagram/6.jpg" alt></a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  </div>
</template>
<script>
export default {
  name:'login',
  component: {
  }
}
</script>