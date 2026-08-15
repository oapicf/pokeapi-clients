//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:openapi/src/model/version_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_flavor_text.g.dart';

/// PokemonSpeciesFlavorText
///
/// Properties:
/// * [flavorText] 
/// * [language] 
/// * [version] 
@BuiltValue()
abstract class PokemonSpeciesFlavorText implements Built<PokemonSpeciesFlavorText, PokemonSpeciesFlavorTextBuilder> {
  @BuiltValueField(wireName: r'flavor_text')
  String get flavorText;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  @BuiltValueField(wireName: r'version')
  VersionSummary get version;

  PokemonSpeciesFlavorText._();

  factory PokemonSpeciesFlavorText([void updates(PokemonSpeciesFlavorTextBuilder b)]) = _$PokemonSpeciesFlavorText;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesFlavorTextBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesFlavorText> get serializer => _$PokemonSpeciesFlavorTextSerializer();
}

class _$PokemonSpeciesFlavorTextSerializer implements PrimitiveSerializer<PokemonSpeciesFlavorText> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesFlavorText, _$PokemonSpeciesFlavorText];

  @override
  final String wireName = r'PokemonSpeciesFlavorText';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesFlavorText object, {
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
    PokemonSpeciesFlavorText object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesFlavorTextBuilder result,
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
  PokemonSpeciesFlavorText deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesFlavorTextBuilder();
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

