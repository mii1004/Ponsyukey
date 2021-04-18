/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package javajo.ponsyukey.controller;

import javajo.ponsyukey.model.CreateSake;
import javajo.ponsyukey.model.SakeResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-18T16:39:18.697306+09:00[Asia/Tokyo]")
@Validated
@Api(value = "sake", description = "the sake API")
public interface SakeApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /sake : 酒情報登録API
     *
     * @param createSake 酒情報登録に必要な情報 (required)
     * @return http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする (status code 200)
     *         or http ステータスコード 400 error (status code 400)
     *         or http ステータスコード 500 error (status code 500)
     */
    @ApiOperation(value = "酒情報登録API", nickname = "createSake", notes = "", response = Object.class, tags={ "sake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする", response = Object.class),
        @ApiResponse(code = 400, message = "http ステータスコード 400 error"),
        @ApiResponse(code = 500, message = "http ステータスコード 500 error") })
    @PostMapping(
        value = "/sake",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Object> createSake(@ApiParam(value = "酒情報登録に必要な情報" ,required=true )  @Valid @RequestBody CreateSake createSake) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sake : 酒情報一覧取得API
     *
     * @param limit  (required)
     * @param offset  (required)
     * @return http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする (status code 200)
     *         or http ステータスコード 400 error (status code 400)
     *         or http ステータスコード 500 error (status code 500)
     */
    @ApiOperation(value = "酒情報一覧取得API", nickname = "getSake", notes = "", response = Object.class, tags={ "sake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする", response = Object.class),
        @ApiResponse(code = 400, message = "http ステータスコード 400 error"),
        @ApiResponse(code = 500, message = "http ステータスコード 500 error") })
    @GetMapping(
        value = "/sake",
        produces = { "application/json" }
    )
    default ResponseEntity<Object> getSake(@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "limit", required = true) Integer limit,@NotNull @ApiParam(value = "", required = true) @Valid @RequestParam(value = "offset", required = true) Integer offset) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /sake/{sakeId} : 酒情報取得API
     *
     * @param sakeId  (required)
     * @return http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする (status code 200)
     *         or http ステータスコード 400 error (status code 400)
     *         or http ステータスコード 500 error (status code 500)
     */
    @ApiOperation(value = "酒情報取得API", nickname = "getSakeDetail", notes = "", response = SakeResponse.class, tags={ "sake", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "http ステータスコード 200 ok。バリデーションエラー時も200でレスポンスする", response = SakeResponse.class),
        @ApiResponse(code = 400, message = "http ステータスコード 400 error"),
        @ApiResponse(code = 500, message = "http ステータスコード 500 error") })
    @GetMapping(
        value = "/sake/{sakeId}",
        produces = { "application/json" }
    )
    default ResponseEntity<SakeResponse> getSakeDetail(@ApiParam(value = "",required=true) @PathVariable("sakeId") String sakeId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"resultCode\" : \"resultCode\", \"sake\" : { \"alcohol\" : 0.8008282, \"image\" : \"image\", \"polishingRatio\" : 6.0274563, \"taste\" : \"{}\", \"name\" : \"name\", \"brewery\" : { \"prefecture\" : \"prefecture\", \"name\" : \"name\" }, \"description\" : \"description\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"type\" : \"type\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
