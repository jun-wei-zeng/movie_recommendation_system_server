package cn.zjw.mrs.service;

import cn.zjw.mrs.entity.Movie;
import cn.zjw.mrs.entity.Result;
import cn.zjw.mrs.vo.movie.MovieCardVo;
import cn.zjw.mrs.vo.movie.MovieStripVo;
import cn.zjw.mrs.vo.movie.ReviewedMovieStripVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author zjw
* @description 针对表【movie】的数据库操作Service
* @createDate 2022-04-07 19:01:20
*/
public interface MovieService extends IService<Movie> {

    /**
     * 返回电影分页结果
     * @param currentPage 当前页码
     * @param pageSize 每页电影数量
     * @param type 电影类型
     * @param region 电影地区
     * @param search 搜索关键字
     * @return 分页结果-电影列表
     */
    Page<Movie> getPageMovies(Integer currentPage, Integer pageSize, String type, String region, String search);

    /**
     * 通过did去数据库中查找”喜欢这部电影的人也喜欢。。。“的电影条目
     * @param did 电影did
     * @return ”喜欢这部电影的人也喜欢。。。”电影条目
     */
    List<MovieCardVo> getRecommendedMoviesByMovieId(Long did);

    /**
     * 获取用户id为uid的用户评价过的所有电影的基本信息
     * @param uid 用户id
     * @return 评价过的电影条目
     */
    List<ReviewedMovieStripVo> getAllReviewedMoviesByUserId(Long uid);

    /**
     * 获取搜索关键字模糊匹配的电影名称列表
     * @param keywords 搜索关键字
     * @return 电影名称列表
     */
    List<String> getMatchMovieName(String keywords);

}
