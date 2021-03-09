<template>
  <div class="page-wrapper">
    <!-- start my-account-section -->
    <section class="my-account-section">
      <div class="container-1410">
        <div class="row">
          <div class="col-xs-offset-4 col-xs-4">
            <div class="woocommerce">
              <div class="woocommerce-notices-wrapper"></div>
              <div class="u-columns col-8" id="customer_login">
                <div class="u-column col-2">
                  <h1 class="text-center">AZEDW</h1>
                  <h3 class="text-center">회원가입</h3>
                  <form class="woocommerce-form woocommerce-form-login login" method="post">
                    <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                      <label for="username">이메일&nbsp;<span class="required">*</span></label>
                      <input type="text" class="woocommerce-Input woocommerce-Input--text input-text" name="username" id="username" autocomplete="username" />
                    </p>
                    <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                      <label for="password">비밀번호&nbsp;<span class="required">*</span></label>
                      <input class="woocommerce-Input woocommerce-Input--text input-text" type="text" name="password" id="password" autocomplete="current-password" />
                    </p>
                    <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                      <label for="password">이름&nbsp;<span class="required">*</span></label>
                      <input class="woocommerce-Input woocommerce-Input--text input-text" type="text" name="name" id="name" autocomplete="current-password" />
                    </p>
                    <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                      <label for="password">전화번호&nbsp;<span class="required">*</span></label>
                      <input class="woocommerce-Input woocommerce-Input--text input-text" type="text" name="tel" id="tel" autocomplete="current-password" />
                    </p>
                    <p class="form-row text-center">
                      <input type="hidden" id="woocommerce-login-nonce" name="woocommerce-login-nonce" value="f0e969fd27" /><input type="hidden" name="_wp_http_referer" value="/my-account/" />               <button type="submit" class="woocommerce-button button woocommerce-form-login__submit" name="login" value="Log in">회원가입</button>
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
  </div>
</template>
<script>
export default {

}
</script>