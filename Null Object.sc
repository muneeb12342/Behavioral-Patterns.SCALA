trait Sound{
  def play()
}
class Music extends Sound{
  def play() {/*...*/}
}
object SoundSource{
  def getSound: Option[Sound]=
    if (available) Some(sound) else None
}
for(Sound<- SoundSource.getSound){
  Sound.play()
}
