//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:openapi/src/model/version_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_form_flavor_text.g.dart';

/// PokemonFormFlavorText
///
/// Properties:
/// * [flavorText] - The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
/// * [language] - The language this name is in.
/// * [version] - The game version this flavor text is extracted from.
@BuiltValue()
abstract class PokemonFormFlavorText implements Built<PokemonFormFlavorText, PokemonFormFlavorTextBuilder> {
  /// The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
  @BuiltValueField(wireName: r'flavor_text')
  String get flavorText;

  /// The language this name is in.
  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  /// The game version this flavor text is extracted from.
  @BuiltValueField(wireName: r'version')
  VersionSummary get version;

  PokemonFormFlavorText._();

  factory PokemonFormFlavorText([void updates(PokemonFormFlavorTextBuilder b)]) = _$PokemonFormFlavorText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonFormFlavorTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonFormFlavorText> get serializer => _$PokemonFormFlavorTextSerializer();
}

class _$PokemonFormFlavorTextSerializer implements PrimitiveSerializer<PokemonFormFlavorText> {
  @override
  final Iterable<Type> types = const [PokemonFormFlavorText, _$PokemonFormFlavorText];

  @override
  final String wireName = r'PokemonFormFlavorText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonFormFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'flavor_text';
    yield serializers.serialize(
      object.flavorText,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(LanguageSummary),
    );
    yield r'version';
    yield serializers.serialize(
      object.version,
      specifiedType: const FullType(VersionSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonFormFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonFormFlavorTextBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'flavor_text':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.flavorText = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LanguageSummary),
          ) as LanguageSummary;
          result.language.replace(valueDes);
          break;
        case r'version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(VersionSummary),
          ) as VersionSummary;
          result.version.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonFormFlavorText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonFormFlavorTextBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


