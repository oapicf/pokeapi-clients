//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/language_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_habitat_name.g.dart';

/// PokemonHabitatName
///
/// Properties:
/// * [name] 
/// * [language] 
@BuiltValue()
abstract class PokemonHabitatName implements Built<PokemonHabitatName, PokemonHabitatNameBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'language')
  LanguageSummary get language;

  PokemonHabitatName._();

  factory PokemonHabitatName([void updates(PokemonHabitatNameBuilder b)]) = _$PokemonHabitatName;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonHabitatNameBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonHabitatName> get serializer => _$PokemonHabitatNameSerializer();
}

class _$PokemonHabitatNameSerializer implements PrimitiveSerializer<PokemonHabitatName> {
  @override
  final Iterable<Type> types = const [PokemonHabitatName, _$PokemonHabitatName];

  @override
  final String wireName = r'PokemonHabitatName';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonHabitatName object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'language';
    yield serializers.serialize(
      object.language,
      specifiedType: const FullType(LanguageSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonHabitatName object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonHabitatNameBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'language':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(LanguageSummary),
          ) as LanguageSummary;
          result.language.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonHabitatName deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonHabitatNameBuilder();
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

